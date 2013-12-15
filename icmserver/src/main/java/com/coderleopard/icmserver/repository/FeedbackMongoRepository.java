/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderleopard.icmserver.repository;

import com.coderleopard.icmserver.domain.entities.Feedback;
import org.springframework.stereotype.Repository;

/**
 *
 * @author kavan
 */
@Repository
public class FeedbackMongoRepository extends GenericMongoRepository<Feedback> 
implements FeedbackRepository{
    
}
