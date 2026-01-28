package daoimpl;

import dao.TourismDAO;
import dto.DestinationDTO;
import dto.TouristDTO;
import util.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TourismDAOImpl implements TourismDAO {

    public boolean addDestination(DestinationDTO d) {
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO destination(name, location) VALUES (?,?)"
            );
            ps.setString(1, d.getName());
            ps.setString(2, d.getLocation());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<DestinationDTO> viewDestinations() {
        List<DestinationDTO> list = new ArrayList<>();
        try {
            Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM destination");

            while (rs.next()) {
                DestinationDTO d = new DestinationDTO();
                d.setDestId(rs.getInt(1));
                d.setName(rs.getString(2));
                d.setLocation(rs.getString(3));
                list.add(d);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean addTourist(TouristDTO t) {
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO tourist(name, phone) VALUES (?,?)"
            );
            ps.setString(1, t.getName());
            ps.setString(2, t.getPhone());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<TouristDTO> viewTourists() {
        List<TouristDTO> list = new ArrayList<>();
        try {
            Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM tourist");

            while (rs.next()) {
                TouristDTO t = new TouristDTO();
                t.setTouristId(rs.getInt(1));
                t.setName(rs.getString(2));
                t.setPhone(rs.getString(3));
                list.add(t);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
