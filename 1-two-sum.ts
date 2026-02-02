// Brute force 
// Time complexity = O(n2)
// space complexity = O(1)

// nums = [3,2,4], target = 6
// 3 + 2 != 6
// 3 + 4 != 6
// 2 + 4 == 6 => return [1, 2]


// Enhanced solution 
// Time complexity = O(n) => for the one loop
// space complexity = O(n)

// function twoSum(nums: number[], target: number): number[] {
//   const numsMap = new Map<number, number>()

//   for (let i = 0; i < nums.length; i++) {
//     numsMap.set(nums[i], i)
//   }

//   let output: number[] = []

//   for (let i = 0; i < nums.length; i++) {
//     let expectedNumber = target - nums[i]
//     if (numsMap.has(expectedNumber) && i != numsMap.get(expectedNumber)) {
//       output = [i, numsMap.get(expectedNumber)]
//     }
//   }

//   return output
// }


// cleaner solution

function twoSum(nums: number[], target: number): number[] {
    const numsMap = new Map<number, number>();

    for (let i = 0; i< nums.length; i++) {
        const expectedNumber = target - nums[i];
        const exists = numsMap.get(expectedNumber);

        if(exists != undefined) {
            return [i, exists];
        }

        numsMap.set(nums[i], i)
    }
};

// more better one with an Object instead of hash map
// https://dev.to/mehedibangladeshi/why-map-lookups-are-slower-than-object-lookups-in-javascript-33g8
// https://stackoverflow.com/questions/62350146/why-map-manipulation-is-much-slower-than-object-in-javascript-v8-for-integ

function twoSum(nums: number[], target: number): number[] {
    const numsObj = {}

    for (let i = 0; i< nums.length; i++) {
        const expectedNumber = target - nums[i];
        const exists = numsObj[expectedNumber];

        if(exists !== undefined) {
            return [i, exists];
        }

        numsObj[nums[i]] = i
    }
};