/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var search = function (nums, target) {
  let lo = 0,
    hi = nums.length;
  while (lo < hi) {
    const m = Math.floor(lo + (hi - lo) / 2);
    if (nums[m] === target) return m;
    if (nums[m] > target) hi = m;
    if (nums[m] < target) lo = m + 1;
  }
  return -1;
};
