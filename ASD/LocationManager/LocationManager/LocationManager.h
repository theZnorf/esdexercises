//
// Created by franz on 28.11.15.
//

#ifndef LOCATIONMANAGER_LOCATIONMANAGER_H
#define LOCATIONMANAGER_LOCATIONMANAGER_H

#include "Location.h"

#include <vector>
#include <ostream>
#include <functional>

class LocationManager
{
    // Definitions
private:
    using LocationContainer = std::vector<Location>;
    using GetSortingValFunc =  std::function<double(Location const &)>;

    // Methods
public:
    // Add a location
    void Add(Location const &loc);

    // Sort locations by x coordinate (ascending)
    void SortByX();

    // Sort locations by y coordinate (ascending)
    void SortByY();

    // Sort locations by distance from given location (ascending)
    void SortByDistance(Location const &loc);

    // Remove all locations with negative x or y coordinates
    void RemoveNegativeXOrY();

    // Get number of locations within the given distance
    // from the given location
    size_t GetNrLocationsWithin(Location const &loc,
                                double const distance) const;

    // Write all locations to output stream
    void Print(std::ostream &out) const;

private:
    // Internal method for sorty with given function
    void SortBy(GetSortingValFunc func);

    // Member
private:
    LocationContainer mLocations;
};


#endif //LOCATIONMANAGER_LOCATIONMANAGER_H
