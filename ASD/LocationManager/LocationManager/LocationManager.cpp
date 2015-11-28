//
// Created by franz on 28.11.15.
//

#include "LocationManager.h"

#include <algorithm>

using namespace std;

void LocationManager::Add(Location const &loc)
{
    // add location
    mLocations.push_back(loc);
}

void LocationManager::SortByX()
{
    SortBy([](Location const &location)
           { return location.GetX(); });
}

void LocationManager::SortByY()
{
    SortBy([](Location const &location)
           { return location.GetY(); });
}

void LocationManager::SortByDistance(Location const &loc)
{
    SortBy([&loc](Location const &location)
           {
               return location.GetDistance(loc);
           });
}

void LocationManager::RemoveNegativeXOrY()
{
    remove_if(mLocations.begin(), mLocations.end(), [](Location const &location)
    {
        return (location.GetX() < 0) || (location.GetY() < 0);
    });
}

size_t LocationManager::GetNrLocationsWithin(Location const &loc,
                                             double const distance) const
{
    size_t nrOfLocations = 0;

    for_each(mLocations.begin(), mLocations.end(),
             [&nrOfLocations, &loc, distance](Location const &location)
             {
                 // check location
                 if (loc.GetDistance(location) < distance)
                     nrOfLocations++;
             });

    return nrOfLocations;
}

void LocationManager::Print(ostream &out) const
{
    for_each(mLocations.begin(), mLocations.end(),
             [&out](Location const &location)
             {
                 out << location << " ";
             });
}

void LocationManager::SortBy(GetSortingValFunc func)
{
    sort(mLocations.begin(), mLocations.end(),
         [&func](Location const &loc0, Location const &loc1)
         {
             return func(loc0) < func(loc1);
         });
}