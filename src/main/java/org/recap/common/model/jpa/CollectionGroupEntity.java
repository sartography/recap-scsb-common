package org.recap.common.model.jpa;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by pvsubrah on 6/11/16.
 */
@Data
@Entity
@Table(name = "collection_group_t", schema = "recap", catalog = "")
public class CollectionGroupEntity implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "COLLECTION_GROUP_ID")
    private Integer collectionGroupId;

    @Column(name = "COLLECTION_GROUP_CODE")
    private String collectionGroupCode;

    @Column(name = "COLLECTION_GROUP_DESC")
    private String collectionGroupDescription;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATED_DATE")
    private Date createdDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "LAST_UPDATED_DATE")
    private Date lastUpdatedDate;

}
