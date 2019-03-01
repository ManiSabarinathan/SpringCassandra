package com.example.demoCassandra.repository;

import java.util.UUID;
import org.springframework.data.cassandra.repository.CassandraRepository;
import com.example.demoCassandra.model.Coupon;

public interface CouponRepository extends CassandraRepository<Coupon, UUID> {
	


}