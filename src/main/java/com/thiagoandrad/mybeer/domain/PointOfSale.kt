package com.thiagoandrad.mybeer.domain

import com.vividsolutions.jts.geom.MultiPolygon
import com.vividsolutions.jts.geom.Point
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType.IDENTITY
import javax.persistence.Id
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

@Entity(name = "points_of_sale")
data class PointOfSale (
        @Id
        @GeneratedValue(strategy = IDENTITY)
        val id: Int,

        @Column(name = "trading_name")
        @field:NotBlank
        val tradingName: String,

        @Column(name = "owner_name")
        @field:NotBlank
        val ownerName: String,

        @Column(name = "document")
        @field:NotBlank
        val document: String,

        @Column(name = "address")
        @field:NotNull
        val address: Point,

        @Column(name = "coverage_area")
        @field:NotNull
        val coverageArea: MultiPolygon
)