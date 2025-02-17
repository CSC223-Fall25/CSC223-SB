package csc223.sb;

public class TreeNode {
    
    char data;
    TreeNode left;
    TreeNode right;

    public TreeNode(){
        this.data = ' ';
        this.left = null;
        this.right = null;
        }

    public TreeNode(char x){
        this.data = x;
        this.left = null;
        this.right = null;
    }
}
