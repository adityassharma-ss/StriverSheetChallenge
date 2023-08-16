import java.util.*;

public class CourseSchedule {
    public static void main(String[] args) {
        int[][] prerequisites = {{1,0}};
        int numCourses = 2;
        System.out.println(canFinish(numCourses, prerequisites));
    }

    public static boolean canFinish(int numCourses, int[] prerequisites){
        List<List<Integer>> adList = new ArrayList<>();
        for(int i=0; i<numCourses; i++){
            adList.add(new ArrayList<>(i));
        }

        int[] indegree = new int[numCourses];
        for(int[] prerequisite : prerequisites){
            adList.get(prerequisite[1]).add(prerequisite[0]);
            indegree[prerequisite[0]]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i<numCourses; i++){
            if(indegree[i] == 0){
                queue.offer(i);
            }
        }

        int count = 0;
        while(!queue.isEmpty()){
            int course = queue.poll();
            count++;
            for(int neighbor : adList.get(course)){
                if(--indegree[neighbor] == 0){
                    queue.offer(neighbor);
                }
            }
        }
        return (count==numCourses)?true:false;
    }
}
