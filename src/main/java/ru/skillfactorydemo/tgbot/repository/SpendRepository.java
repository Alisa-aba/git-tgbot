package ru.skillfactorydemo.tgbot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.skillfactorydemo.tgbot.enity.Spend;

@Repository
public interface SpendRepository extends JpaRepository<Spend, Long> {
}