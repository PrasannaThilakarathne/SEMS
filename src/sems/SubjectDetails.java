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
public class SubjectDetails extends AbstractTableModel{
    
     private static final String[] COLUMN_NAMES = {"Subject Code","Subject Name","Description","ID"};
    private static ArrayList<Subject> list;
    
   public SubjectDetails(ArrayList<Subject> sList) {
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
         
        case 0: return list.get(rowIndex).getSubCode();
        case 1:return  list.get(rowIndex).getSubName();
        case 2 :return list.get(rowIndex).getDescription();
        case 3 :return list.get(rowIndex).getSubId();
        
        default:return "Error";
            
                
        }
    }
 
    
    
}
