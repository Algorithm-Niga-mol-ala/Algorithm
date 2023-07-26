package movie;

public interface IMovieManager {
	void add(Movie movie);
	
	Movie[] getList();
	
	Movie[] searchByTitle(String title);
	
	Movie[] getMovies();
	
	SeriesMovie[] getSeriesMovie();
	
	double getRunningTimeAvg();
}
