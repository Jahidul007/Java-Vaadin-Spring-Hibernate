# Batch Update 
Most JDBC drivers provide improved performance if you batch multiple calls to the same prepared statement. By grouping updates into batches you limit the number of round trips to the database. This section will cover batch processing using both the JdbcTemplate and the SimpleJdbcTemplate.<br/>
<br/>-> NoticeDAO.java
<br/>public int[] create(List<Notice> notices) {<br/>
		SqlParameterSource[] params = SqlParameterSourceUtils.createBatch(notices.toArray());<br/>
		return jdbc.batchUpdate("insert into notices (name, email, text) values(:name, :email,:text)", params);<br/>
	}
