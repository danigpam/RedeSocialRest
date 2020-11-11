/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Post;

/**
 *
 * @author DANIELLEGONCALVESPRA
 */
public class PostDAO {

    private static List<Post> todosPosts;

    static {
        todosPosts = new ArrayList<Post>();
        todosPosts.add(new Post(1, new Date(), "Post 1", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean egestas sodales orci ac condimentum. Duis vulputate condimentum enim ac tempor. Ut quis leo ac orci dignissim molestie. Vivamus hendrerit id lacus a sollicitudin. Vivamus imperdiet finibus est, sit amet euismod turpis pharetra congue. Praesent tristique lobortis varius. Suspendisse tempus sed tortor ut fringilla. Pellentesque tristique pharetra diam id interdum. Aliquam sed placerat dui. Vivamus feugiat massa nec ex imperdiet vulputate. Fusce quis odio purus. Etiam dignissim placerat nunc eget placerat. Sed auctor quam et massa hendrerit, vitae dignissim diam scelerisque. "));
        todosPosts.add(new Post(2, new Date(), "Post 2", "Aliquam finibus, leo nec accumsan congue, justo lectus tempus augue, quis auctor lectus justo vel lorem. Curabitur quis diam suscipit erat viverra consectetur. Vestibulum pellentesque enim nec lobortis aliquam. Duis felis felis, facilisis ut metus in, congue ultricies ligula. Maecenas neque ligula, semper at sollicitudin sed, gravida a nunc. Phasellus ut elit vehicula, luctus enim id, scelerisque ante. Aliquam nibh sem, porta sed vestibulum a, malesuada dignissim purus. Nunc tempor justo a lectus posuere pellentesque. Duis pharetra magna in ligula ornare, id dapibus dolor aliquam. Suspendisse potenti. Nunc dictum et mi ut egestas. Donec eget ante ac nisl mollis lobortis. Donec in orci nibh. Ut massa nunc, condimentum vel dapibus sed, aliquet sit amet dolor. "));
        todosPosts.add(new Post(3, new Date(), "Post 3", "Integer a fringilla ipsum. Etiam viverra magna justo, vehicula blandit sem tempus eget. Donec tortor leo, mollis non nibh eu, semper scelerisque mauris. Aliquam consequat ex ac euismod consequat. Vestibulum porttitor urna vitae ante mollis lobortis. Etiam nec orci lobortis, porttitor augue non, dapibus libero. Nullam viverra felis sit amet odio luctus, et varius tortor semper. "));
        todosPosts.add(new Post(4, new Date(), "Post 4", "Curabitur non accumsan metus, eu pulvinar diam. Ut quis ornare tortor, non pharetra urna. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Praesent ligula dui, egestas sit amet rutrum id, accumsan ut leo. In at rutrum metus. Nullam urna felis, sagittis semper velit sodales, ultrices imperdiet nisl. Vivamus finibus aliquet eros, et hendrerit leo luctus at. Proin sagittis tortor quis turpis tincidunt, ut bibendum orci eleifend. Pellentesque molestie vitae lectus et tempor. Pellentesque ac ante mauris. Proin lacinia sollicitudin imperdiet. Quisque nec lectus augue. Aliquam faucibus dui a lorem malesuada ultricies. "));
        todosPosts.add(new Post(5, new Date(), "Post 5", "Nulla quis elementum odio. Integer mattis, odio et ultricies fringilla, dolor nibh faucibus eros, ac cursus massa orci vitae nunc. Donec malesuada turpis lorem, sit amet accumsan nisl pellentesque nec. Integer in porttitor elit. Morbi ullamcorper, nunc non dictum sollicitudin, tortor neque sagittis purus, id suscipit lorem augue vel purus. Ut interdum egestas orci, in fringilla felis blandit ut. Praesent dui dui, blandit quis mi vitae, finibus vestibulum magna. Etiam eu velit dictum, interdum nisl vel, tincidunt turpis. "));
    }

    public void cadastrar(Post usuario) {
        usuario.setId(getNextId());
        todosPosts.add(usuario);
    }

    private int getNextId() {
        int nextId = 1;
        if (todosPosts != null && todosPosts.size() > 0) {
            Post u = todosPosts.get(todosPosts.size() - 1);
            nextId = u.getId() + 1;
        }
        return nextId;
    }

    public List<Post> listarTodos() { 
        return todosPosts;
    }
}
