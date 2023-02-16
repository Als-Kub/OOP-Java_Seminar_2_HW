public class SwimmingPollObstacleAdapter implements Obstacle {
    
    private final SwimmingPoll swimmingPoll;

    public SwimmingPollObstacleAdapter(SwimmingPoll swimmingPoll) {
        this.swimmingPoll = swimmingPoll;
    }

    @Override
    public boolean pass(Participant participant) {
        return swimmingPoll.pass(participant);
    }
}


// public class WallObstacleAdapter implements Obstacle {

//     private final Wall wall;

//     public WallObstacleAdapter(Wall wall) {
//         this.wall = wall;
//     }

//     @Override
//     public boolean pass(Participant participant) {
//         return wall.pass(participant);
//     }
// }

// public class RoadObstacleAdapter implements Obstacle {

//     private final Road road;

//     public RoadObstacleAdapter(Road road) {
//         this.road = road;
//     }

//     @Override
//     public boolean pass(Participant participant) {
//         return road.pass(participant);
//     }
// }