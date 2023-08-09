package ru.netology.last_project_mysql.data;

import lombok.SneakyThrows;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLHelper {
    private static QueryRunner runner = new QueryRunner();

    private SQLHelper() {
    }

    private static Connection getConn() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/app", "user1", "12345W");
    }
    @SneakyThrows
    public static DataHelper.StatusCard getStatusCard() {
        var codeSQL = "SELECT status FROM payment_entity";
        var conn = getConn();
        var code = runner.query(conn, codeSQL, new ScalarHandler<String>());
        return new DataHelper.StatusCard(status);
    }
    @SneakyThrows
    public static void cleanDataBase() {
        var connection = getConn();
        runner.execute(connection, "DELETE FROM payment_entity");
    }
}
