package dao;

import dao.mysql.MovieDAOImpl;

public class DAOFactory {

	public static MovieDAO getMovieDAOInstance() {
		return new MovieDAOImpl();
	}
	

}
