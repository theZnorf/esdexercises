//
// Franz Profelt
// S1410567019
//

#ifndef COWVECTOR_COWVECTOR_H
#define COWVECTOR_COWVECTOR_H

#include <vector>
#include <memory>
#include <algorithm>
#include <exception>

namespace ASD
{
    template<typename T>
    class COWVector
    {
        // Definitions
    private:
        using containerType = std::vector<T>;
        using containerPointerType = std::shared_ptr<containerType>;

        // C-Tor / Copy C-Tor
    public:
        COWVector() :
                container(new containerType())
        { }

        // Methods
    public:
        size_t size() const
        {
            return container->size();
        }

        void push_back(T const &x)
        {
            // check if current data is unique
            if (!container.unique())
                createNew();

            container->push_back(x);

        }

        void pop_back()
        {
            // check if container is empty
            if (container->empty())
                throw std::out_of_range("COWVector: index out of range");

            // check if current data is unique
            if (!container.unique())
                createNew();

            container->pop_back();
        }

        T const &get(size_t i) const
        {
            // check if index is out of bounds
            if (i >= container->size())
                throw std::out_of_range("COWVector: index out of range");

            return (*container.get())[i];
        }

        void set(size_t i, T const &x)
        {
            // check if current data is unique
            if (!container.unique())
                createNew();

            (*container.get())[i] = x;
        }

        long refCount() const
        {
            return container.use_count();
        }

    private:
        void createNew()
        {
            container.reset(new containerType(*container));
        }

        // Member
    private:
        containerPointerType container;
    };
}
#endif //COWVECTOR_COWVECTOR_H
