#include <iostream>
#include <algorithm>
#include <cassert>
#include <vector>
#include <memory>
#include <functional>
#include <iterator>

using namespace std;

class Object {
public:
  explicit Object(double value) : mValue(value) {}
  double GetValue() const { return mValue; }
private:
  double mValue;
};

using Objects = vector<unique_ptr<Object>>;

double Median(Objects const &objects) {
  assert(!objects.empty());
  vector<double> values;
  // Alternative 1: Explizite Schleife
//  for (auto &obj : objects) {
//    values.push_back(obj->GetValue());
//  }
  // Alternative 2: transform + mem_fn/bind
  //transform(objects.begin(), objects.end(), back_inserter(values), mem_fn(&Object::GetValue));
  // Alternative 3: transform + Lambda
  transform(objects.begin(), objects.end(), back_inserter(values), [](unique_ptr<Object> const& obj) {return obj->GetValue();});
  size_t nr = objects.size();
  size_t m = nr / 2;
  partial_sort(values.begin(), values.begin() + m + 1, values.end());
  if (nr % 2 == 1) {
    return values[m];
  }
  return (values[m - 1] + values[m]) / 2;
}

int main() {
  Objects objects;
  objects.emplace_back(new Object(5));
  objects.emplace_back(new Object(2));
  objects.emplace_back(new Object(10));
  objects.emplace_back(new Object(8));
  objects.emplace_back(new Object(1));
  cout << "Median: " << Median(objects) << endl;    // 5
  return 0;
}
