//Inorder Traversal 
//1 null 2 3
//Output 3 1 2

import java.util.ArrayList;
import java.util.List;

class TreeNode{
    int val;
    TreeNode left, right;

    TreeNode(int val){
        this.val = val;
    }
}

public class InorderTraversa {
    public static void inorder(List<Integer> res,TreeNode root){

        if(root == null){
            return ;
        }
        inorder(res, root.left);
        res.add(root.val);
        inorder(res , root.right);

    }


    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left = new TreeNode(3);

        List<Integer> res = new ArrayList<>();

        inorder(res, root);

        System.out.println(res);


        
    }
    
}
