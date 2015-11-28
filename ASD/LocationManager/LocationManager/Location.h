#ifndef LOCATION_H
#define LOCATION_H

#include <ostream>

class Location {
public:

  Location(double x, double y):mX(x), mY(y) {}

  double GetX() const { return mX; }
  double GetY() const { return mY; }

  double GetDistance(Location const &loc) const;

private:
  double mX;
  double mY;
};

inline std::ostream &operator<<(std::ostream &out, Location const &loc) {
  return out << '(' << loc.GetX() << ", " << loc.GetY() << ')';
}

#endif
