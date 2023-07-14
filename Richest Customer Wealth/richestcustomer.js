/**
 * @param {number[][]} accounts
 * @return {number}
 */
var maximumWealth = function(accounts) {
    var max;
    for(let i = 0; i < accounts.length; i++){
        var curr = 0;
        for(let j = 0; j < accounts[i].length; j++){
            curr += accounts[i][j];
        }
        if(max < curr || max == null){
            max = curr;
        }
    }
    return max;
};