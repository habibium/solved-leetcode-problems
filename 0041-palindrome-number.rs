struct Solution;

impl Solution {
    pub fn is_palindrome(x: i32) -> bool {
        if x < 0 {
            return false;
        }

        let mut remaining_digits = x;
        let mut reversed = 0;

        while remaining_digits != 0 {
            reversed = reversed * 10 + remaining_digits % 10;
            remaining_digits /= 10;
        }

        return x == reversed;
    }
}

fn main() {
    assert_eq!(Solution::is_palindrome(121), true);
    assert_eq!(Solution::is_palindrome(120), false);
    println!("All tests passed!");
}
