package queries;

public class CarQuery {
    public static final String ADD_CAR="INSERT INTO car(brand,model,engine,production,bodyType,seats,doors,speed,rentAmount) "+
            "VALUES(?,?,?,?,?,?,?,?,?)";
    public static final String SHOW_CAR="SELECT * FROM car";

}
