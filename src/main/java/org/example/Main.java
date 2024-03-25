package org.example;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Vuz vuz =new Vuz();
        Library library = new Library();
        BookDistribution bookDistribution = new BookDistribution(vuz,library);
        // Создаем корневой узел
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Корень");

        // Создаем узлы для папок "Студенты" и "Преподаватели"
        DefaultMutableTreeNode studentsNode = new DefaultMutableTreeNode("Студенты");
        DefaultMutableTreeNode teachersNode = new DefaultMutableTreeNode("Преподаватели");

        // Добавляем узлы папок в корневой узел
        root.add(studentsNode);
        root.add(teachersNode);

        // Создаем узлы для имен студентов и добавляем их в узел папки "Студенты"
        for (int i = 0; i < bookDistribution.getStudents().size(); i++) {
            DefaultMutableTreeNode studentNode = new DefaultMutableTreeNode(bookDistribution.students.get(i).getName());

            // Создаем узлы для книг и добавляем их в узел имени студента
            for (int j = 0; j <bookDistribution.students.get(i).getBooks().size() ; j++) {
                DefaultMutableTreeNode bookNode = new DefaultMutableTreeNode(bookDistribution.students.get(i).getBooks().get(j).getName());
                studentNode.add(bookNode);
            }

            studentsNode.add(studentNode);
        }

        // Создаем узлы для имен преподавателей и добавляем их в узел папки "Преподаватели"
        for (int i = 0; i < bookDistribution.teachers.size(); i++) {
            DefaultMutableTreeNode teacherNode = new DefaultMutableTreeNode(bookDistribution.teachers.get(i).getName());

            // Создаем узлы для книг и добавляем их в узел имени преподавателя
            for (int j = 0; j < bookDistribution.teachers.get(i).getBooks().size(); j++) {
                DefaultMutableTreeNode bookNode = new DefaultMutableTreeNode(bookDistribution.teachers.get(i).getBooks().get(j).getName());
                teacherNode.add(bookNode);
            }

            teachersNode.add(teacherNode);
        }

        // Создаем модель дерева и устанавливаем корневой узел
        DefaultTreeModel treeModel = new DefaultTreeModel(root);

        // Создаем компонент JTree с моделью дерева
        JTree tree = new JTree(treeModel);

        // Отображаем окно с деревом
        JFrame frame = new JFrame("Генератор дерева на JTree");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new JScrollPane(tree));
        frame.pack();
        frame.setVisible(true);
    }
}