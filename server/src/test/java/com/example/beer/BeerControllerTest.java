package com.example.beer;

import com.example.DemoApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.not;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Test class for the Beer REST controller.
 *
 * @see BeerController
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class BeerControllerTest {

    @Autowired
    private BeerRepository beerRepository;

    @Autowired
    private EntityManager em;

    private MockMvc mockMvc;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        BeerController beerController = new BeerController(beerRepository);
        this.mockMvc = MockMvcBuilders.standaloneSetup(beerController).build();
    }

    @Test
    @Transactional
    public void getGoodBeers() throws Exception {
        // Initialize the database
        Beer beer1 = new Beer("White Rascal");
        Beer beer2 = new Beer("Budweiser");
        beerRepository.saveAndFlush(beer1);
        beerRepository.saveAndFlush(beer2);

        // Get all the blogList
        mockMvc.perform(get("/good-beers"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andExpect(jsonPath("$.[*].id").value(hasItem(beer1.getId().intValue())))
                .andExpect(jsonPath("$.[*].name").value(hasItem(beer1.getName())))
                .andExpect(jsonPath("$.[*].name").value(not(beer2.getName())));
    }
}