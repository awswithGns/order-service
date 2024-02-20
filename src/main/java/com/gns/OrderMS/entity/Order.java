package com.gns.OrderMS.entity;

import com.gns.OrderMS.dto.FoodItemsDTO;
import com.gns.OrderMS.dto.Restaurant;
import com.gns.OrderMS.dto.UserDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("order")
public class Order {
    private Integer orderId;
    private List<FoodItemsDTO> footItemDTOList;
    private Restaurant restaurant;
    private UserDTO userDTO;

}
