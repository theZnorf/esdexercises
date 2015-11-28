//
// Created by franz on 28.11.15.
//

#include "LocationManager.h"

#include <random>
#include <iostream>
#include <functional>

using namespace std;

int main(int argc, char **argv)
{
    const size_t numberOfLocations = 5;
    const double min = -3.0;
    const double max = 20.0;

    Location diffLoc(0, 0);
    double distance = 20;

    default_random_engine generator;
    uniform_real_distribution<double> distribution(min, max);
    auto random = bind(distribution, generator);

    cout << "started" << endl;
    LocationManager manager;

    for (auto i = 0; i < numberOfLocations; i++)
    {
        Location loc(random(), random());
        manager.Add(loc);
    }

    cout << "Print inital locations: ";
    manager.Print(cout);
    cout << endl;

    manager.SortByX();
    cout << "Print locations sorted by X: ";
    manager.Print(cout);
    cout << endl;

    manager.SortByY();
    cout << "Print locations sorted by Y: ";
    manager.Print(cout);
    cout << endl;

    manager.SortByDistance(diffLoc);
    cout << "Print locations sorted by distance to " << diffLoc << ": ";
    manager.Print(cout);
    cout << endl;

    manager.RemoveNegativeXOrY();
    manager.SortByX();
    cout << "Print locations sorted by X and all negative X or Y removed: ";
    manager.Print(cout);
    cout << endl;

    cout << "Print number of locations within " << distance << " from " <<
        diffLoc << ": ";
    cout << manager.GetNrLocationsWithin(diffLoc, distance) << endl;

    cout << "finished" << endl;

    return 0;
}