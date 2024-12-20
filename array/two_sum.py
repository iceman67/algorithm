"""
Given an array of integers, return indices of the two numbers
such that they add up to a specific target.

You may assume that each input would have exactly one solution,
and you may not use the same element twice.

Example:
    Given nums = [2, 7, 11, 15], target = 9,

    Because nums[0] + nums[1] = 2 + 7 = 9,
    return (0, 1)
"""


def two_sum(array, target = 0 ):
    dic = {}
    for i, num in enumerate(array):
        if num in dic:
            return dic[num], i
        else:
            dic[target - num] = i
    return None


# find two numbers that is the same nuber of target when adding them
if __name__ == "__main__":
    nums = [2, 7, 11, 15]
    target = 18
    result = two_sum(nums, target)  
    print (f'two sum : {result}')