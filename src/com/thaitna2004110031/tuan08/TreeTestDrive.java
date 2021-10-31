package com.thaitna2004110031.tuan08;

public class TreeTestDrive {
    public static void main(String[] args) {
        TreeDemoProgram test = new TreeDemoProgram();
        
        test.add(6);
        test.add(4);
        test.add(8);
        test.add(3);
        test.add(5);
        test.add(7);
        test.add(9);
        // System.out.println("Tim");
        // test.containsNode(3);

        // System.out.println("Xoa");
        // test.delete(3);

        System.out.println("Left Root Right");
        // test.traverseInOrder(4);

        System.out.println("Left Right Root");
        //test.traversePostOrder();

        System.out.println("Root Left Right");
        test.traverseLevelOrder();

    }
}
