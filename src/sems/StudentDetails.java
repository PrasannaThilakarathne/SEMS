/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sems;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Acer
 */
public class StudentDetails extends AbstractTableModel{
    
    private static final String[] COLUMN_NAMES = {"RegID","First Name","Last Name","Email","Age","Address","Gender","Faculty","Department","Year OF Registration"};
    private static ArrayList<Student> list;

    public StudentDetails(ArrayList<Student> sList) {
        list = sList;
    }
    @Override
    public int getRowCount() {
        return list.size();
    }
    @Override
    public int getColumnCount() {
        return COLUMN_NAMES.length;
    }
    @Override
    public String getColumnName(int columnIndex){
    return COLUMN_NAMES[columnIndex];
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
        case 0:return list.get(rowIndex).getRegID();
        case 1:return  list.get(rowIndex).getFirstName();
        case 2:return list.get(rowIndex).getLastName();
        case 3:return list.get(rowIndex).getEmail();
        case 4:return list.get(rowIndex).getAge();
        case 5:return list.get(rowIndex).getAddress();
        case 6:return list.get(rowIndex).getGender();
        case 7:return list.get(rowIndex).getFaculty();
        case 8:return list.get(rowIndex).getDepartment();
        case 9:return list.get(rowIndex).getYearofreg();
        default:return "Error";        
        }
    }
    
}
 