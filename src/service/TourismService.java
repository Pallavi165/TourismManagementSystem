package service;

import dao.TourismDAO;
import daoimpl.TourismDAOImpl;
import dto.DestinationDTO;
import dto.TouristDTO;
import java.util.List;

public class TourismService {

    TourismDAO dao = new TourismDAOImpl();

    public boolean addDestination(DestinationDTO d) {
        return dao.addDestination(d);
    }

    public List<DestinationDTO> viewDestinations() {
        return dao.viewDestinations();
    }

    public boolean addTourist(TouristDTO t) {
        return dao.addTourist(t);
    }

    public List<TouristDTO> viewTourists() {
        return dao.viewTourists();
    }
}
