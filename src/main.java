public class main {
public static void main(String[] args) {
    BST mytree = new BST();
    mytree.add(15);
    mytree.add(9);
    mytree.add(60);
    mytree.add(53);
    mytree.sumBST(mytree.root); // performs (post-order) 9+53+60+15
}

    public int sumBST(BSTnode currentnode) {
        int sum = 0; // sum is the sum of the current node and nodes below it

        // going down the branches

        // checking left brach first, if there is something there, call function again; will go all the way left
        if (currentnode.left != null) {
            sum += sumBST(currentnode.left); // calling function on left branch
        }

        // if left branch is empty or all the numbers on that side have been recorded, go to the right branch next
        // checking right branch next, if there is something there, keep going
        if (currentnode.right != null) {
            sum += sumBST(currentnode.right); // calling function on right branch
        }

        // if right and left branch have been recorded/are empty, add the current node to sum
        sum += currentnode.data;
        return sum; // returns the current sum up the function so that we can keep adding to it
    }
    }
