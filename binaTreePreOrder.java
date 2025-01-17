package com.tech.day;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class binaTreePreOrder {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    List<Integer> list = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {

        if(root == null){
            return Collections.emptyList();
        }
        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return list;
    }
}
