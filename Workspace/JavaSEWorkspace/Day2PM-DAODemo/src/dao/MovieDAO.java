package dao;

import java.util.ArrayList;

import dto.MovieDTO;
import exception.MyDataException;

public interface MovieDAO {

	ArrayList<MovieDTO> findAllMovies() throws MyDataException;

	int updateMovie(MovieDTO m) throws MyDataException;

}