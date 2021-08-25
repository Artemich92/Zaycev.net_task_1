public class TaskFirst {
    public static void main(String[] args) {
        TaskFirst.Employee tester = new TaskFirst.Employee(7, new TaskFirst.Vacancy("Developer"));
        System.out.println(tester.getId());
        System.out.println(tester.getVacancy());
    }

    static class Employee {
        private long id;
        private TaskFirst.Vacancy vacancy;

        public Employee(int id, TaskFirst.Vacancy vacancy) {
            this.id = (long)id;
            this.vacancy = vacancy;
        }

        String getVacancy() {
            return this.vacancy.getVacancy();
        }

        long getId() {
            return this.id;
        }
    }

    static class Vacancy {
        private String position;

        public Vacancy(String position) {
            this.position = position;
        }

        String getVacancy() {
            return this.position;
        }
    }
}
