//
// Created by franz on 28.11.15.
//

#include "Set.h"

#include <gtest/gtest.h>

using namespace std;

auto intTestData = {1, 34, 5, 665, 123123, -2323,-32424};
auto unsignedCharTestData = {1, 34, 5, 234, 231, 23};
auto signedCharTestData = {1, 34, 5, 123, -3, -123};

int i0 = 1, i1 = 43, i2 = -224, i3 = 1234, i4 = -2443;
auto intPtrTestData = {&i0, &i1, &i2, &i3, &i4};

TEST(IntTest, TestCreate)
{
    Set<int> set;
}

TEST(IntTest, TestAddAndCount)
{
    Set<int> set;
    for (auto & val : intTestData)
    {
        ASSERT_TRUE(set.Add(val));
    }

    ASSERT_EQ(intTestData.size(), set.Count());
}

TEST(IntTest, TestAddAndRemove)
{
    Set<int> set;
    for (auto & val : intTestData)
    {
        ASSERT_TRUE(set.Add(val));
    }

    ASSERT_TRUE(set.Remove(*intTestData.begin()));

    ASSERT_EQ(intTestData.size() -1, set.Count());
}

TEST(IntTest, TestAddAndContains)
{
    Set<int> set;
    for (auto & val : intTestData)
    {
        ASSERT_TRUE(set.Add(val));
    }

    for (auto & val : intTestData)
    {
        ASSERT_TRUE(set.Contains(val));
    }
}

TEST(UnsignedCharTest, TestCreate)
{
    Set<unsigned char> set;
}

TEST(UnsignedCharTest, TestAddAndCount)
{
    Set<unsigned char> set;
    for (auto & val : unsignedCharTestData)
    {
        ASSERT_TRUE(set.Add(val));
    }

    ASSERT_EQ(unsignedCharTestData.size(), set.Count());
}

TEST(UnsignedCharTest, TestAddAndRemove)
{
    Set<unsigned char> set;
    for (auto & val : unsignedCharTestData)
    {
        ASSERT_TRUE(set.Add(val));
    }

    ASSERT_TRUE(set.Remove(*unsignedCharTestData.begin()));

    ASSERT_EQ(unsignedCharTestData.size() -1, set.Count());
}

TEST(UnsignedCharTest, TestAddAndContains)
{
    Set<int> set;
    for (auto & val : unsignedCharTestData)
    {
        ASSERT_TRUE(set.Add(val));
    }

    for (auto & val : unsignedCharTestData)
    {
        ASSERT_TRUE(set.Contains(val));
    }
}

TEST(SignedCharTest, TestCreate)
{
    Set<signed char> set;
}

TEST(SignedCharTest, TestAddAndCount)
{
    Set<signed char> set;
    for (auto & val : signedCharTestData)
    {
        ASSERT_TRUE(set.Add(val));
    }

    ASSERT_EQ(signedCharTestData.size(), set.Count());
}

TEST(SignedCharTest, TestAddAndRemove)
{
    Set<signed char> set;
    for (auto & val : signedCharTestData)
    {
        ASSERT_TRUE(set.Add(val));
    }

    ASSERT_TRUE(set.Remove(*signedCharTestData.begin()));

    ASSERT_EQ(signedCharTestData.size() -1, set.Count());
}

TEST(SignedCharTest, TestAddAndContains)
{
    Set<int> set;
    for (auto & val : signedCharTestData)
    {
        ASSERT_TRUE(set.Add(val));
    }

    for (auto & val : signedCharTestData)
    {
        ASSERT_TRUE(set.Contains(val));
    }
}

TEST(IntPtrTest, TestCreate)
{
    Set<int *> set;
}

TEST(IntPtrTest, TestAddAndCount)
{
    Set<int *> set;
    for (auto & val : intPtrTestData)
    {
        ASSERT_TRUE(set.Add(val));
    }

    ASSERT_EQ(intPtrTestData.size(), set.Count());
}

TEST(IntPtrTest, TestAddAndRemove)
{
    Set<int *> set;
    for (auto & val : intPtrTestData)
    {
        ASSERT_TRUE(set.Add(val));
    }

    ASSERT_TRUE(set.Remove(*intPtrTestData.begin()));

    ASSERT_EQ(intPtrTestData.size() -1, set.Count());
}

TEST(IntPtrTest, TestAddAndContains)
{
    Set<int *> set;
    for (auto & val : intPtrTestData)
    {
        ASSERT_TRUE(set.Add(val));
    }

    for (auto & val : intPtrTestData)
    {
        ASSERT_TRUE(set.Contains(val));
    }
}

int main(int argc, char** argv)
{
    ::testing::InitGoogleTest(&argc, argv);
    return RUN_ALL_TESTS();
}