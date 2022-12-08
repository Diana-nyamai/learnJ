package leetcode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> rst = new ArrayList<>();
        if(root == null){return rst;}
        StringBuilder sb = new StringBuilder();
        helper(rst, sb, root);
        return rst;
    }
    public static void helper(List<String> rst, StringBuilder sb, TreeNode root) {
        if (root == null) {
            return;
        }
        int temp = sb.length();
        if(root.left == null && root.right == null){
            sb.append(root.val);
            rst.add(sb.toString());
            sb.delete(temp, sb.length());
            return;
        }
        sb.append(root.val + "->");
        helper(rst, sb, root.left);
        helper(rst, sb, root.right);
        sb.delete(temp, sb.length());
        return;
    }
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add(null);
        list.add("5");
        System.out.println(binaryTreePaths((TreeNode) list));
    }
}
