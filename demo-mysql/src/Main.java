import com.mysql.cj.jdbc.Driver;


import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "123456");


            // Statement stm = connection.createStatement();

            //chèn dữ liệu

            /*String sql = "INSERT INTO users(full_name,email,address,password) VALUES('Lieu','camliu.com','Bac Giang','123456')";
            if(stm.execute(sql)==true){
                System.out.println("successful");
            }else {
                System.out.println("fail");
            }
            */

            //Update thong tin
           /* String sql = "UPDATE users SET full_name = 'Cam Lieu cute' WHERE id >=4 ";
            int rowAffect = stm.executeUpdate(sql);
            System.out.println("Da co: "+rowAffect+ " dc cap nhat");

            */

            //lấy dữ liệu về

           /*  String sql = "SELECT * FROM users";

            ResultSet resultSet = stm.executeQuery(sql);
            while (resultSet.next()){
                System.out.println("ID: "+ resultSet.getInt("id"));
                System.out.println("Full name: "+ resultSet.getString("full_name"));
                System.out.println("Email: "+ resultSet.getString("email"));
                System.out.println("Address: "+ resultSet.getString("address"));
                System.out.println("Password: "+ resultSet.getString("password"));
                System.out.println("---------------------------------------");

            }

            */

            /*Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet resultSet = statement.executeQuery("SELECT*FROM users");
            resultSet.next();

            resultSet.updateString("full_name","Phan Hoan");
            resultSet.updateString("email","hoanhd.com");
            resultSet.updateRow();

             */

            /*resultSet.relative(1); // trỏ đến vị trí : relative / absoluted
           while (resultSet.next()){
                System.out.println("ID: "+ resultSet.getInt("id"));
                System.out.println("Full name: "+ resultSet.getString("full_name"));
                System.out.println("Email: "+ resultSet.getString("email"));
                System.out.println("Address: "+ resultSet.getString("address"));
                System.out.println("Password: "+ resultSet.getString("password"));
                System.out.println("---------------------------------------");
            }

            */
            /*
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO users(full_name,email,address,password) VALUES (?,?,?,?)");
            preparedStatement.setString(1, "Le Quynh Giang");
            preparedStatement.setString(2, "giang.com");
            preparedStatement.setString(3, "Ha Tinh");
            preparedStatement.setString(4, "123456");
            preparedStatement.execute();

            preparedStatement.setString(1, "Phan Thanh Nhan");
            preparedStatement.setString(2, "Nhanthanh.com");
            preparedStatement.setString(3, "Yen Bai");
            preparedStatement.setString(4, "123456");
            preparedStatement.execute();


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException exception) {
            System.out.println("Cann't connect" + exception.getMessage());
        }

        try {
            connection.close();
            System.out.println("Connection closed");
        } catch (Exception e) {
            System.out.println("Cann't connect" + e.getMessage());
        }
        */
            Scanner scanner = new Scanner(System.in);
            String email, mk;
            System.out.println("Nhập email: ");
            email = scanner.nextLine();
            System.out.println("Nhập password: ");
            mk = scanner.nextLine();

            String sql = "SELECT COUNT(*) FROM users where (email = ? and  password= ?)";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, email);
            stm.setString(2, mk);
            ResultSet set = stm.executeQuery();
            while (set.next()){
                int count = set.getInt(1);
                if (count > 0) {
                    System.out.println("Đăng nhập thành công");
                } else {
                    System.out.println("Đăng nhập thất bại");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}