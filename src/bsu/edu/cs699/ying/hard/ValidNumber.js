/**
 *https://leetcode.com/problems/valid-number/#/description
 1481 / 1481 test cases passed.
Status: Accepted
Runtime: 139 ms
 * @return {boolean}
 */

/*
 * @param {string} s
 * @return {boolean}
 */
var isNumber = function(s) {
    if(s==" ")
        return false;

    return !isNaN(s);

};