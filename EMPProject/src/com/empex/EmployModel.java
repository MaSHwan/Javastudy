package com.empex;

import java.util.*;
import javax.swing.table.*;

// �����ü�� �������� ��ü
public class EmployModel extends AbstractTableModel {
	
	Object[][] data;
	Object[] columnName;
	
	employeeDAO emDao = new employeeDAO();
	EmployeeVO emVo;
	ArrayList<String> title;
	ArrayList<EmployeeVO> list;
	
	public EmployModel() {
		/*
		 *  ���� ������ ���� ������ �˾ƾ� 2���� �迭�� ������
		 *  ���̺����� �÷��� �̸��� ���ͼ� 1���� �迭�� ����
		 */
		
		title = emDao.getColumnName();
		columnName = title.toArray();
		
		int columnCount = title.size();
		list = emDao.getEmployeeTotal();
		
		int rowCount = list.size();
		
		data = new Object[rowCount][columnCount];
		
		for(int index = 0; index < rowCount; index++) {
			emVo = list.get(index);
			data[index][0] = emVo.getNo();
			data[index][1] = emVo.getName();
			data[index][2] = emVo.getJobgrade();
			data[index][3] = emVo.getDepartment();
			data[index][4] = emVo.getEmail();
		}

	}
	
	@Override
	public int getRowCount() {
		if(data == null)
		return 0;
		else
			return data.length;
	}

	@Override
	public String getColumnName(int column) {
		
		return (String)columnName[column];
	}
	
	@Override
	public int getColumnCount() {
		if(columnName == null)
		return 0;
		else
			return columnName.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		
		return data[rowIndex][columnIndex];
	}

}