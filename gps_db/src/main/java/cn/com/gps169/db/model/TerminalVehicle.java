package cn.com.gps169.db.model;

public class TerminalVehicle {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gps_terminal_vehicles.terminal_vehicles_id
     *
     * @mbggenerated
     */
    private Integer terminalVehiclesId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gps_terminal_vehicles.terminal_id
     *
     * @mbggenerated
     */
    private Integer terminalId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gps_terminal_vehicles.vehicle_id
     *
     * @mbggenerated
     */
    private Integer vehicleId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gps_terminal_vehicles.terminal_vehicles_id
     *
     * @return the value of gps_terminal_vehicles.terminal_vehicles_id
     *
     * @mbggenerated
     */
    public Integer getTerminalVehiclesId() {
        return terminalVehiclesId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gps_terminal_vehicles.terminal_vehicles_id
     *
     * @param terminalVehiclesId the value for gps_terminal_vehicles.terminal_vehicles_id
     *
     * @mbggenerated
     */
    public void setTerminalVehiclesId(Integer terminalVehiclesId) {
        this.terminalVehiclesId = terminalVehiclesId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gps_terminal_vehicles.terminal_id
     *
     * @return the value of gps_terminal_vehicles.terminal_id
     *
     * @mbggenerated
     */
    public Integer getTerminalId() {
        return terminalId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gps_terminal_vehicles.terminal_id
     *
     * @param terminalId the value for gps_terminal_vehicles.terminal_id
     *
     * @mbggenerated
     */
    public void setTerminalId(Integer terminalId) {
        this.terminalId = terminalId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gps_terminal_vehicles.vehicle_id
     *
     * @return the value of gps_terminal_vehicles.vehicle_id
     *
     * @mbggenerated
     */
    public Integer getVehicleId() {
        return vehicleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gps_terminal_vehicles.vehicle_id
     *
     * @param vehicleId the value for gps_terminal_vehicles.vehicle_id
     *
     * @mbggenerated
     */
    public void setVehicleId(Integer vehicleId) {
        this.vehicleId = vehicleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gps_terminal_vehicles
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TerminalVehicle other = (TerminalVehicle) that;
        return (this.getTerminalVehiclesId() == null ? other.getTerminalVehiclesId() == null : this.getTerminalVehiclesId().equals(other.getTerminalVehiclesId()))
            && (this.getTerminalId() == null ? other.getTerminalId() == null : this.getTerminalId().equals(other.getTerminalId()))
            && (this.getVehicleId() == null ? other.getVehicleId() == null : this.getVehicleId().equals(other.getVehicleId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gps_terminal_vehicles
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTerminalVehiclesId() == null) ? 0 : getTerminalVehiclesId().hashCode());
        result = prime * result + ((getTerminalId() == null) ? 0 : getTerminalId().hashCode());
        result = prime * result + ((getVehicleId() == null) ? 0 : getVehicleId().hashCode());
        return result;
    }
}