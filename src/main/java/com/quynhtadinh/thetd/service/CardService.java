package com.quynhtadinh.thetd.service;

import com.quynhtadinh.thetd.entity.Card;
import com.quynhtadinh.thetd.entity.Customer;
import com.quynhtadinh.thetd.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CardService {
    @Autowired
    private CardRepository cardRepository;

        public List<Card> getAllCards() {
            return cardRepository.findAll();
        }

        public Card getCardById(Long id) {
            return cardRepository.findById(id)
                    .orElseThrow(() -> new RuntimeException("Card not found with id: " + id));
        }

        public Card addCard(Card card) {
            return cardRepository.save(card);
        }

        public Card updateCard(Long id, Card cardDetails) {
            Card card = getCardById(id);
            card.setCardNumber(cardDetails.getCardNumber());
            card.setCardHolderName(cardDetails.getCardHolderName());
            card.setExpirationDate(cardDetails.getExpirationDate());
            card.setCardType(cardDetails.getCardType());
            card.setBalance(cardDetails.getBalance());
            card.setImage(cardDetails.getImage());
            card.setCustomer(cardDetails.getCustomer());
            return cardRepository.save(card);
        }

        public void deleteCard(Long id) {
            Card card = getCardById(id);
            cardRepository.delete(card);
        }
    }
