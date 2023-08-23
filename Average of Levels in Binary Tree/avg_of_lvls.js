/**
 * Given the root of a binary tree, return the average value of the nodes 
 * on each level in the form of an array.
 * 
 * @param {TreeNode} root
 * @return {number[]}
 */
var averageOfLevels = function(root) {
    let queue = []; /* queue of nodes */
    queue.push(root); // add root to the queue

    // create an array to store the averages
    let averages = []; /* array of averages */

    // loop while the queue is not empty
    while(queue.length > 0) { 
        // get the size of the queue and working sum
        let size = queue.length;
        let curr_sum = 0;

        // loop through the queue
        for(let i = 0; i < size; i++) {
            // remove the first node from the queue
            let node = queue.shift();

            // add the value of the node to the sum
            curr_sum += node.val;

            // add the left and right children to the queue
            if(node.left) queue.push(node.left);
            if(node.right) queue.push(node.right);
        }
        // calculate the average
        let average = curr_sum / size;
        // add the average to the averages array
        averages.push(average);

    }
    // return the level averages 
    return averages;
};

/**
 * Definition for a binary tree node.
 * 
 * @param {number}   val   - value of the node
 * @param {TreeNode} left  - left child of the node
 * @param {TreeNode} right - right child of the node
 */
function TreeNode(val, left, right){
    this.val = (val===undefined ? 0 : val)
    this.left = (left===undefined ? null : left)
    this.right = (right===undefined ? null : right)
}