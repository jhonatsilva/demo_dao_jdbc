package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.protocol.a.DebugBufferingPacketReader;

import db.DB;
import db.DbIntegrityException;
import model.entities.Department;

public class Program {

	public static void main(String[] args) {

		Department obj = new Department(1, "English Courses");
		System.out.println(obj);
	}
}