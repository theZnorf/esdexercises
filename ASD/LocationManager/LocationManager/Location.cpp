#include <cmath>
#include "Location.h"

using namespace std;

double Location::GetDistance(Location const &loc) const {
  double dx = mX-loc.mX;
  double dy = mY-loc.mY;
  return sqrt(dx*dx+dy*dy);
}
