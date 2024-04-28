package org.pram.quarkus;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import lombok.RequiredArgsConstructor;
import org.pram.quarkus.model.UsersQuery;
import org.pram.quarkus.repository.UserDataService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.util.List;

@RequiredArgsConstructor
@ApplicationScoped
public class UsersQueryHandler extends QueryHandlerBase<UsersQuery, List<UserEntity>> {
    final Logger logger = LogManager.getLogger(UsersQueryHandler.class);

    @Inject
    UserDataService userRepository;

    @Override
    public List<UserEntity> handle(UsersQuery query) {
        logger.info("Started handling the query request");
        List<UserEntity> userEntities = userRepository.getAll();
        logger.info("Completed handling the query request");
        return userEntities;
    }
}
