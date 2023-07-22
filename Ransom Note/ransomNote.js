/**
 * my solution/idea from the start
 *
 * @param {string} ransomNote - string to see if it can be constructed
 * @param {string} magazine   - string we will be trying to construct from
 * @return {boolean}          - true if we can construct, false otherwise
 */
var canConstruct = function(ransomNote, magazine) {
    // go through and search for each character in ransomNote in magazine,
    // if found, remove that character from magazine and continue
    for(const char of magazine){ // iterate magazine with each character
        ransomNote = ransomNote.replace(char, ''); // if found, remove from ransomNote
    }
    return !ransomNote; // if ransomNote is empty, return true, else false
};

/**
 * solution from leetcode with more efficiency 
 * 
 * @param {string} ransomNote - string to see if it can be constructed
 * @param {string} magazine   - string we will be trying to construct from
 * @return {boolean}          - true if we can construct, false otherwise
 */
var canConstruct = function(ransomNote, magazine) {
    map = {}; // acts are a counter for characters in magazine

    // iterate through magazine and count each character
    for(let letter of magazine){
        if(map[letter] === undefined){ // if that letter is not in map, set to 0
            map[letter] = 0;
        }
        map[letter]++; // increment count for that letter if present
    }

    // iterate through ransomNote and see if in map, if not return false
    for(let letter of ransomNote){
        if(map[letter] === undefined || map[letter] <= 0){ // letter not present OR not enough
            return false;
        }
        map[letter]--; // decrement count for that letter if present
    }
    return true; // if we get here, we can construct ransomNote from magazine
};
