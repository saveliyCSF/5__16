package com.company;

public class Solution extends BinaryTree {
    public boolean solution(BinaryTree<Integer> first, BinaryTree<Integer> second){
        return !recur(first.getRoot(), second.getRoot());
    }

    private boolean recur(BinaryTree.SimpleTreeNode first, BinaryTree.SimpleTreeNode second) {
        System.out.println(((int)first.getValue() == (int)second.getValue()) + " " + (int)first.getValue());
        if(((int)first.getValue() == (int)second.getValue()) && first.hasLeft() == second.hasLeft() && first.hasRight() == second.hasRight()){
            System.out.println("recur");
           if(first.hasLeft())
               if(recur(first.getLeft(), second.getLeft()))
                   return true;
           if(first.hasRight())
               return recur(first.getRight(), second.getRight());
        } else
            return true;
        return false;
    }
}
