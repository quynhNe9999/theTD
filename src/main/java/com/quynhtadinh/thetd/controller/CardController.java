package com.quynhtadinh.thetd.controller;

import com.quynhtadinh.thetd.entity.Card;
import com.quynhtadinh.thetd.service.CardService;
import com.quynhtadinh.thetd.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/cards")
public class CardController {

    @Autowired
    private CardService cardService;

    @Autowired
    private CustomerService customerService; // Assuming you have a CustomerService to fetch customers

    @GetMapping
    public String viewCardsList(Model model) {
//        List<Card> cards = cardService.getAllCards();
//        model.addAttribute("cards", cards);
        return "cards-list";
    }

    @GetMapping("/add")
    public String showAddCardForm(Model model) {
        model.addAttribute("card", new Card());
        model.addAttribute("customers", customerService.getAllCustomers()); // Fetching customers for the dropdown
        return "add-edit-card";
    }

    @PostMapping("/add")
    public String addCard(@ModelAttribute("card") Card card) {
        cardService.addCard(card);
        return "redirect:/cards";
    }

    @GetMapping("/edit/{id}")
    public String showEditCardForm(@PathVariable Long id, Model model) {
        Card card = cardService.getCardById(id);
        model.addAttribute("card", card);
        model.addAttribute("customers", customerService.getAllCustomers());
        return "add-edit-card";
    }

    @PostMapping("/update/{id}")
    public String updateCard(@PathVariable Long id, @ModelAttribute("card") Card card) {
        cardService.updateCard(id, card);
        return "redirect:/cards";
    }

    @PostMapping("/delete/{id}")
    public String deleteCard(@PathVariable Long id) {
        cardService.deleteCard(id);
        return "redirect:/cards";
    }
}

