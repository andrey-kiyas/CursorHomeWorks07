package com.CursorHomeWorks07.Shop;

import com.CursorHomeWorks07.Shop.ShopException.BadRequestException;
import com.CursorHomeWorks07.Shop.ShopException.ShopNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ShopController {

    private final ShopService shopService;

    @Autowired
    public ShopController(ShopService shopService) {
        this.shopService = shopService;
    }

    @GetMapping("/shops")
    public ResponseEntity<String> getAllShops() {
        ArrayList<Shop> shopList = shopService.getShopList();
        return new ResponseEntity<>("Current list of stores: " + shopList, HttpStatus.OK);
    }

    @PostMapping( "/create")
    public ResponseEntity<String> createShop(@RequestBody Shop shop) {
        try {
            Shop newShop = shopService.createShop(shop);
            return new ResponseEntity<>("Created success: " + newShop, HttpStatus.CREATED);
        } catch (BadRequestException exception) {
            return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<String> findShopById(@PathVariable("id") long id) throws ShopNotFoundException {
        try {
            Shop shopFind = shopService.findByShopId(id);
            return new ResponseEntity<>("Found: " + shopFind, HttpStatus.OK);
        } catch (ShopNotFoundException exception) {
            return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delShopById(@PathVariable("id") long id) throws ShopNotFoundException {
        try {
            Shop shopDelete = shopService.findByShopId(id);
            shopService.deleteShop(id);
            return new ResponseEntity<>("Deleted: " + shopDelete, HttpStatus.MOVED_PERMANENTLY);
        } catch (ShopNotFoundException exception) {
            return new ResponseEntity<>("Shop \"id=" + id + "\" no found", HttpStatus.NOT_FOUND);
        }
    }

    @PatchMapping( "/update")
    public ResponseEntity<String> updateShop(@RequestBody Shop shop) {
        try {
            Shop shopUpdate = shopService.updateShop(shop);
            return new ResponseEntity<>("Updated: " + shopUpdate, HttpStatus.OK);
        } catch (ShopNotFoundException exception) {
            return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
}
