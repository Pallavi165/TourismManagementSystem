package dao;

import dto.DestinationDTO;
import dto.TouristDTO;
import java.util.List;

public interface TourismDAO {

    boolean addDestination(DestinationDTO destination);
    List<DestinationDTO> viewDestinations();

    boolean addTourist(TouristDTO tourist);
    List<TouristDTO> viewTourists();
}
