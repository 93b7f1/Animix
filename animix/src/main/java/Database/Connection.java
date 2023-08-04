package Database;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Alexandre Costa
 */
public class Connection {

    private JdbcTemplate conexao;

    public Connection() {

        BasicDataSource datasource = new BasicDataSource();
        datasource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        datasource.setUrl("...");
        datasource.setUsername("...");
        datasource.setPassword("...");
        
        conexao = new JdbcTemplate(datasource);
    }

    public JdbcTemplate getConnection() {
        return conexao;
    }

    
}
