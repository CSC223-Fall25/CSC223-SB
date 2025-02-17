package csc223.sb;

public class BinaryTree implements Tree{

    TreeNode root;

    void BinaryTree(){
        this.root = new TreeNode();
    }
    
    @Override
    public void insert(char x){
        if (root == null){
            root = new TreeNode(x);
            return;
        }
        
            
        }
}
